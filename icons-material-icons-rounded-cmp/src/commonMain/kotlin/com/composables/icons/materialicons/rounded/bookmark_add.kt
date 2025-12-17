package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Bookmark_add: ImageVector
    get() {
        if (_Bookmark_add != null) return _Bookmark_add!!
        
        _Bookmark_add = ImageVector.Builder(
            name = "bookmark_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(7f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                curveTo(20.55f, 5f, 21f, 5.45f, 21f, 6f)
                close()
                moveTo(19f, 19.48f)
                curveToRelative(0f, 0.72f, -0.73f, 1.2f, -1.39f, 0.92f)
                lineTo(12f, 18f)
                lineToRelative(-5.61f, 2.4f)
                curveTo(5.73f, 20.69f, 5f, 20.2f, 5f, 19.48f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                lineToRelative(7f, 0f)
                curveToRelative(-0.63f, 0.84f, -1f, 1.87f, -1f, 3f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                curveToRelative(0.34f, 0f, 0.68f, -0.03f, 1f, -0.1f)
                verticalLineTo(19.48f)
                close()
            }
        }.build()
        
        return _Bookmark_add!!
    }

private var _Bookmark_add: ImageVector? = null

