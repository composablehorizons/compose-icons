package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Sanitizer: ImageVector
    get() {
        if (_Sanitizer != null) return _Sanitizer!!
        
        _Sanitizer = ImageVector.Builder(
            name = "sanitizer",
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
                moveTo(15.5f, 6.5f)
                curveToRelative(0f, -0.56f, 0.67f, -1.49f, 1.11f, -2.04f)
                curveToRelative(0.2f, -0.25f, 0.58f, -0.25f, 0.77f, 0f)
                curveToRelative(0.44f, 0.55f, 1.11f, 1.48f, 1.11f, 2.04f)
                curveTo(18.5f, 7.33f, 17.83f, 8f, 17f, 8f)
                reflectiveCurveTo(15.5f, 7.33f, 15.5f, 6.5f)
                close()
                moveTo(19.5f, 15f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -1.25f, -1.41f, -3.16f, -2.11f, -4.04f)
                curveToRelative(-0.2f, -0.25f, -0.57f, -0.25f, -0.77f, 0f)
                curveTo(18.41f, 9.34f, 17f, 11.25f, 17f, 12.5f)
                curveTo(17f, 13.88f, 18.12f, 15f, 19.5f, 15f)
                close()
                moveTo(12f, 14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineTo(8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(0f)
                curveTo(13f, 14.45f, 12.55f, 14f, 12f, 14f)
                close()
                moveTo(16f, 12f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineTo(6f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -2.97f, 2.16f, -5.43f, 5f, -5.91f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                curveTo(7.45f, 4f, 7f, 3.55f, 7f, 3f)
                verticalLineToRelative(0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.61f, 0f, 1.19f, 0.11f, 1.72f, 0.31f)
                curveToRelative(0.67f, 0.25f, 0.83f, 1.13f, 0.33f, 1.64f)
                lineToRelative(0f, 0f)
                curveTo(14.77f, 4.23f, 14.36f, 4.31f, 14f, 4.18f)
                curveTo(13.68f, 4.06f, 13.35f, 4f, 13f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.09f)
                curveTo(13.84f, 6.57f, 16f, 9.03f, 16f, 12f)
                close()
            }
        }.build()
        
        return _Sanitizer!!
    }

private var _Sanitizer: ImageVector? = null

