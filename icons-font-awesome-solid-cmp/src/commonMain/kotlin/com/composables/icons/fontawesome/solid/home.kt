package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Home: ImageVector
    get() {
        if (_Home != null) return _Home!!
        
        _Home = ImageVector.Builder(
            name = "home",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280.37f, 148.26f)
                lineTo(96f, 300.11f)
                verticalLineTo(464f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                lineToRelative(112.06f, -0.29f)
                arcToRelative(16f, 16f, 0f, false, false, 15.92f, -16f)
                verticalLineTo(368f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, -16f)
                horizontalLineToRelative(64f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, 16f)
                verticalLineToRelative(95.64f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16.05f)
                lineTo(464f, 480f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(300f)
                lineTo(295.67f, 148.26f)
                arcToRelative(12.19f, 12.19f, 0f, false, false, -15.3f, 0f)
                close()
                moveTo(571.6f, 251.47f)
                lineTo(488f, 182.56f)
                verticalLineTo(44.05f)
                arcToRelative(12f, 12f, 0f, false, false, -12f, -12f)
                horizontalLineToRelative(-56f)
                arcToRelative(12f, 12f, 0f, false, false, -12f, 12f)
                verticalLineToRelative(72.61f)
                lineTo(318.47f, 43f)
                arcToRelative(48f, 48f, 0f, false, false, -61f, 0f)
                lineTo(4.34f, 251.47f)
                arcToRelative(12f, 12f, 0f, false, false, -1.6f, 16.9f)
                lineToRelative(25.5f, 31f)
                arcTo(12f, 12f, 0f, false, false, 45.15f, 301f)
                lineToRelative(235.22f, -193.74f)
                arcToRelative(12.19f, 12.19f, 0f, false, true, 15.3f, 0f)
                lineTo(530.9f, 301f)
                arcToRelative(12f, 12f, 0f, false, false, 16.9f, -1.6f)
                lineToRelative(25.5f, -31f)
                arcToRelative(12f, 12f, 0f, false, false, -1.7f, -16.93f)
                close()
            }
        }.build()
        
        return _Home!!
    }

private var _Home: ImageVector? = null

