package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Disease: ImageVector
    get() {
        if (_Disease != null) return _Disease!!
        
        _Disease = ImageVector.Builder(
            name = "disease",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(472.29f, 195.9f)
                lineToRelative(-67.06f, -23f)
                curveToRelative(-19.28f, -6.6f, -33.54f, -20.92f, -38.14f, -38.31f)
                lineToRelative(-16f, -60.45f)
                curveToRelative(-11.58f, -43.77f, -76.57f, -57.13f, -110f, -22.62f)
                lineTo(195f, 99.24f)
                curveToRelative(-13.26f, 13.71f, -33.54f, 20.93f, -54.2f, 19.31f)
                lineToRelative(-71.9f, -5.62f)
                curveToRelative(-52f, -4.07f, -86.93f, 44.89f, -59f, 82.84f)
                lineToRelative(38.54f, 52.42f)
                curveToRelative(11.08f, 15.07f, 12.82f, 33.86f, 4.64f, 50.24f)
                lineToRelative(-28.43f, 57f)
                curveTo(4f, 396.67f, 47.46f, 440.29f, 98.11f, 429.23f)
                lineToRelative(70f, -15.28f)
                curveToRelative(20.11f, -4.39f, 41.45f, 0f, 57.07f, 11.73f)
                lineToRelative(54.32f, 40.83f)
                curveToRelative(39.32f, 29.56f, 101f, 7.57f, 104.45f, -37.22f)
                lineToRelative(4.7f, -61.86f)
                curveToRelative(1.35f, -17.8f, 12.8f, -33.87f, 30.63f, -43f)
                lineToRelative(62f, -31.74f)
                curveToRelative(44.84f, -22.96f, 39.55f, -80.17f, -8.99f, -96.79f)
                close()
                moveTo(160f, 256f)
                arcToRelative(32f, 32f, 0f, true, true, 32f, -32f)
                arcToRelative(32f, 32f, 0f, false, true, -32f, 32f)
                close()
                moveToRelative(128f, 96f)
                arcToRelative(32f, 32f, 0f, true, true, 32f, -32f)
                arcToRelative(32f, 32f, 0f, false, true, -32f, 32f)
                close()
                moveToRelative(16f, -128f)
                arcToRelative(16f, 16f, 0f, true, true, 16f, -16f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, 16f)
                close()
            }
        }.build()
        
        return _Disease!!
    }

private var _Disease: ImageVector? = null

