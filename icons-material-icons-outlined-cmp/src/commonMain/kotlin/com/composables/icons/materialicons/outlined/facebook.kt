package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Facebook: ImageVector
    get() {
        if (_Facebook != null) return _Facebook!!
        
        _Facebook = ImageVector.Builder(
            name = "facebook",
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
                moveTo(22f, 12f)
                curveToRelative(0f, -5.52f, -4.48f, -10f, -10f, -10f)
                reflectiveCurveTo(2f, 6.48f, 2f, 12f)
                curveToRelative(0f, 4.84f, 3.44f, 8.87f, 8f, 9.8f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineTo(9.5f)
                curveTo(10f, 7.57f, 11.57f, 6f, 13.5f, 6f)
                horizontalLineTo(16f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6.95f)
                curveTo(18.05f, 21.45f, 22f, 17.19f, 22f, 12f)
                close()
            }
        }.build()
        
        return _Facebook!!
    }

private var _Facebook: ImageVector? = null

