package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Headset_off: ImageVector
    get() {
        if (_Headset_off != null) return _Headset_off!!
        
        _Headset_off = ImageVector.Builder(
            name = "headset_off",
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
                moveTo(12f, 4f)
                curveToRelative(3.87f, 0f, 7f, 3.13f, 7f, 7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.92f)
                lineTo(21f, 17.92f)
                verticalLineTo(11f)
                curveToRelative(0f, -4.97f, -4.03f, -9f, -9f, -9f)
                curveToRelative(-1.95f, 0f, -3.76f, 0.62f, -5.23f, 1.68f)
                lineToRelative(1.44f, 1.44f)
                curveTo(9.3f, 4.41f, 10.6f, 4f, 12f, 4f)
                close()
                moveTo(2.27f, 1.72f)
                lineTo(1f, 3f)
                lineToRelative(3.33f, 3.32f)
                curveTo(3.49f, 7.68f, 3f, 9.29f, 3f, 11f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-8f)
                horizontalLineTo(5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.17f, 0.29f, -2.26f, 0.79f, -3.22f)
                lineTo(15f, 17f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                curveToRelative(0.3f, 0f, 0.59f, -0.06f, 0.86f, -0.14f)
                lineTo(21f, 23f)
                lineToRelative(1.27f, -1.27f)
                lineToRelative(-20f, -20.01f)
                close()
            }
        }.build()
        
        return _Headset_off!!
    }

private var _Headset_off: ImageVector? = null

