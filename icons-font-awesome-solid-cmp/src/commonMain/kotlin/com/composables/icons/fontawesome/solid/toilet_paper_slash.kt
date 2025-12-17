package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ToiletPaperSlash: ImageVector
    get() {
        if (_ToiletPaperSlash != null) return _ToiletPaperSlash!!
        
        _ToiletPaperSlash = ImageVector.Builder(
            name = "toilet-paper-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(64f, 192f)
                verticalLineTo(364.13f)
                curveToRelative(0f, 41.12f, -9.75f, 62.75f, -31.12f, 126.87f)
                arcTo(16f, 16f, 0f, false, false, 48f, 512f)
                horizontalLineTo(328.86f)
                arcToRelative(31.87f, 31.87f, 0f, false, false, 30.38f, -21.87f)
                curveToRelative(9.31f, -27.83f, 18f, -53.35f, 22.18f, -85.55f)
                lineToRelative(-316f, -244.25f)
                curveTo(64.53f, 170.66f, 64f, 181.19f, 64f, 192f)
                close()
                moveTo(633.82f, 458.09f)
                lineToRelative(-102f, -78.81f)
                curveTo(575.28f, 360.91f, 608f, 284.32f, 608f, 192f)
                curveTo(608f, 86f, 565f, 0f, 512f, 0f)
                reflectiveCurveToRelative(-96f, 86f, -96f, 192f)
                curveToRelative(0f, 42f, 7f, 80.4f, 18.43f, 112f)
                lineTo(384f, 265f)
                verticalLineTo(192f)
                curveToRelative(0f, -83.62f, 23.63f, -153.5f, 60.5f, -192f)
                horizontalLineTo(160f)
                curveToRelative(-23.33f, 0f, -44.63f, 16.83f, -61.26f, 44.53f)
                lineTo(45.46f, 3.38f)
                arcTo(16f, 16f, 0f, false, false, 23f, 6.19f)
                lineTo(3.37f, 31.45f)
                arcTo(16f, 16f, 0f, false, false, 6.18f, 53.91f)
                lineTo(594.54f, 508.63f)
                arcTo(16f, 16f, 0f, false, false, 617f, 505.81f)
                lineToRelative(19.64f, -25.26f)
                arcTo(16f, 16f, 0f, false, false, 633.82f, 458.09f)
                close()
                moveTo(512f, 256f)
                curveToRelative(-17.63f, 0f, -32f, -28.62f, -32f, -64f)
                reflectiveCurveToRelative(14.37f, -64f, 32f, -64f)
                reflectiveCurveToRelative(32f, 28.63f, 32f, 64f)
                reflectiveCurveTo(529.62f, 256f, 512f, 256f)
                close()
            }
        }.build()
        
        return _ToiletPaperSlash!!
    }

private var _ToiletPaperSlash: ImageVector? = null

