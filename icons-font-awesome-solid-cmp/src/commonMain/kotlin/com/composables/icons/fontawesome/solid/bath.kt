package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Bath: ImageVector
    get() {
        if (_Bath != null) return _Bath!!
        
        _Bath = ImageVector.Builder(
            name = "bath",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(32f, 384f)
                arcToRelative(95.4f, 95.4f, 0f, false, false, 32f, 71.09f)
                verticalLineTo(496f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(480f)
                horizontalLineTo(384f)
                verticalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(455.09f)
                arcTo(95.4f, 95.4f, 0f, false, false, 480f, 384f)
                verticalLineTo(336f)
                horizontalLineTo(32f)
                close()
                moveTo(496f, 256f)
                horizontalLineTo(80f)
                verticalLineTo(69.25f)
                arcToRelative(21.26f, 21.26f, 0f, false, true, 36.28f, -15f)
                lineToRelative(19.27f, 19.26f)
                curveToRelative(-13.13f, 29.88f, -7.61f, 59.11f, 8.62f, 79.73f)
                lineToRelative(-0.17f, 0.17f)
                arcTo(16f, 16f, 0f, false, false, 144f, 176f)
                lineToRelative(11.31f, 11.31f)
                arcToRelative(16f, 16f, 0f, false, false, 22.63f, 0f)
                lineTo(283.31f, 81.94f)
                arcToRelative(16f, 16f, 0f, false, false, 0f, -22.63f)
                lineTo(272f, 48f)
                arcToRelative(16f, 16f, 0f, false, false, -22.62f, 0f)
                lineToRelative(-0.17f, 0.17f)
                curveToRelative(-20.62f, -16.23f, -49.83f, -21.75f, -79.73f, -8.62f)
                lineTo(150.22f, 20.28f)
                arcTo(69.25f, 69.25f, 0f, false, false, 32f, 69.25f)
                verticalLineTo(256f)
                horizontalLineTo(16f)
                arcTo(16f, 16f, 0f, false, false, 0f, 272f)
                verticalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineTo(496f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(272f)
                arcTo(16f, 16f, 0f, false, false, 496f, 256f)
                close()
            }
        }.build()
        
        return _Bath!!
    }

private var _Bath: ImageVector? = null

