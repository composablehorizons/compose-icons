package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Mobile_screen_share: ImageVector
    get() {
        if (_Mobile_screen_share != null) return _Mobile_screen_share!!
        
        _Mobile_screen_share = ImageVector.Builder(
            name = "mobile_screen_share",
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
                moveTo(17f, 1f)
                horizontalLineTo(7f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 1.99f, 2f)
                horizontalLineToRelative(10f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 18f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(-4.2f, -5.78f)
                verticalLineToRelative(1.75f)
                lineToRelative(2.81f, -2.62f)
                curveToRelative(0.21f, -0.2f, 0.21f, -0.53f, 0f, -0.73f)
                lineTo(12.8f, 9f)
                verticalLineToRelative(1.7f)
                curveToRelative(-3.11f, 0.43f, -4.35f, 2.56f, -4.8f, 4.7f)
                curveToRelative(1.11f, -1.5f, 2.58f, -2.18f, 4.8f, -2.18f)
                close()
            }
        }.build()
        
        return _Mobile_screen_share!!
    }

private var _Mobile_screen_share: ImageVector? = null

