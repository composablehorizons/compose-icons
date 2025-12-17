package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Mobile_screen_share: ImageVector
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
                moveTo(7f, 19f)
                horizontalLineToRelative(10f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(5.8f, -8.28f)
                verticalLineToRelative(-1.7f)
                lineTo(16f, 12f)
                lineToRelative(-3.2f, 2.99f)
                verticalLineToRelative(-1.75f)
                curveToRelative(-2.22f, 0f, -3.69f, 0.68f, -4.8f, 2.18f)
                curveToRelative(0.45f, -2.14f, 1.69f, -4.27f, 4.8f, -4.7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 1f)
                horizontalLineTo(7f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.85f, -1.99f, 1.95f)
                verticalLineToRelative(18f)
                curveTo(5.01f, 22.05f, 5.9f, 23f, 7f, 23f)
                horizontalLineToRelative(10f)
                curveToRelative(1.1f, 0f, 2f, -0.95f, 2f, -2.05f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 18f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(-4.2f, -5.76f)
                verticalLineToRelative(1.75f)
                lineTo(16f, 12f)
                lineToRelative(-3.2f, -2.98f)
                verticalLineToRelative(1.7f)
                curveToRelative(-3.11f, 0.43f, -4.35f, 2.56f, -4.8f, 4.7f)
                curveToRelative(1.11f, -1.5f, 2.58f, -2.18f, 4.8f, -2.18f)
                close()
            }
        }.build()
        
        return _Mobile_screen_share!!
    }

private var _Mobile_screen_share: ImageVector? = null

