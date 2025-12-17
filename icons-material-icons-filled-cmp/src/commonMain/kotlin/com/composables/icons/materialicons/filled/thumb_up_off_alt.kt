package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Thumb_up_off_alt: ImageVector
    get() {
        if (_Thumb_up_off_alt != null) return _Thumb_up_off_alt!!
        
        _Thumb_up_off_alt = ImageVector.Builder(
            name = "thumb_up_off_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.11f, 5.72f)
                lineToRelative(-0.57f, 2.89f)
                curveToRelative(-0.12f, 0.59f, 0.04f, 1.2f, 0.42f, 1.66f)
                curveToRelative(0.38f, 0.46f, 0.94f, 0.73f, 1.54f, 0.73f)
                horizontalLineTo(20f)
                verticalLineToRelative(1.08f)
                lineTo(17.43f, 18f)
                horizontalLineTo(9.34f)
                curveToRelative(-0.18f, 0f, -0.34f, -0.16f, -0.34f, -0.34f)
                verticalLineTo(9.82f)
                lineToRelative(4.11f, -4.1f)
                moveTo(14f, 2f)
                lineTo(7.59f, 8.41f)
                curveTo(7.21f, 8.79f, 7f, 9.3f, 7f, 9.83f)
                verticalLineToRelative(7.83f)
                curveTo(7f, 18.95f, 8.05f, 20f, 9.34f, 20f)
                horizontalLineToRelative(8.1f)
                curveToRelative(0.71f, 0f, 1.36f, -0.37f, 1.72f, -0.97f)
                lineToRelative(2.67f, -6.15f)
                curveToRelative(0.11f, -0.25f, 0.17f, -0.52f, 0.17f, -0.8f)
                verticalLineTo(11f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-5.5f)
                lineToRelative(0.92f, -4.65f)
                curveToRelative(0.05f, -0.22f, 0.02f, -0.46f, -0.08f, -0.66f)
                curveToRelative(-0.23f, -0.45f, -0.52f, -0.86f, -0.88f, -1.22f)
                lineTo(14f, 2f)
                close()
                moveTo(4f, 9f)
                horizontalLineTo(2f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.build()
        
        return _Thumb_up_off_alt!!
    }

private var _Thumb_up_off_alt: ImageVector? = null

