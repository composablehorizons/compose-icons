package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Bookmark_remove: ImageVector
    get() {
        if (_Bookmark_remove != null) return _Bookmark_remove!!
        
        _Bookmark_remove = ImageVector.Builder(
            name = "bookmark_remove",
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
                moveTo(17f, 17.97f)
                lineToRelative(0f, -7.07f)
                curveToRelative(-2.28f, -0.46f, -4f, -2.48f, -4f, -4.9f)
                curveToRelative(0f, -0.34f, 0.03f, -0.68f, 0.1f, -1f)
                lineTo(7f, 5f)
                verticalLineToRelative(12.97f)
                lineToRelative(5f, -2.14f)
                lineTo(17f, 17.97f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 7f)
                horizontalLineToRelative(-6f)
                verticalLineTo(5f)
                horizontalLineToRelative(6f)
                verticalLineTo(7f)
                close()
                moveTo(17f, 17.97f)
                lineToRelative(-5f, -2.14f)
                lineToRelative(-5f, 2.14f)
                verticalLineTo(5f)
                lineToRelative(6.1f, 0f)
                curveToRelative(0.15f, -0.74f, 0.46f, -1.42f, 0.9f, -2f)
                lineTo(7f, 3f)
                curveTo(5.9f, 3f, 5f, 3.9f, 5f, 5f)
                verticalLineToRelative(16f)
                lineToRelative(7f, -3f)
                lineToRelative(7f, 3f)
                lineToRelative(0f, -10.1f)
                curveToRelative(-0.32f, 0.07f, -0.66f, 0.1f, -1f, 0.1f)
                curveToRelative(-0.34f, 0f, -0.68f, -0.03f, -1f, -0.1f)
                lineTo(17f, 17.97f)
                close()
            }
        }.build()
        
        return _Bookmark_remove!!
    }

private var _Bookmark_remove: ImageVector? = null

