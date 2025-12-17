package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Marker: ImageVector
    get() {
        if (_Marker != null) return _Marker!!
        
        _Marker = ImageVector.Builder(
            name = "marker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(93.95f, 290.03f)
                arcTo(327.038f, 327.038f, 0f, false, false, 0.17f, 485.11f)
                lineToRelative(-0.03f, 0.23f)
                curveToRelative(-1.7f, 15.28f, 11.21f, 28.2f, 26.49f, 26.51f)
                arcToRelative(327.02f, 327.02f, 0f, false, false, 195.34f, -93.8f)
                lineToRelative(75.4f, -75.4f)
                lineToRelative(-128.02f, -128.02f)
                lineToRelative(-75.4f, 75.4f)
                close()
                moveTo(485.49f, 26.51f)
                curveToRelative(-35.35f, -35.35f, -92.67f, -35.35f, -128.02f, 0f)
                lineToRelative(-21.76f, 21.76f)
                lineToRelative(-36.56f, -36.55f)
                curveToRelative(-15.62f, -15.62f, -40.95f, -15.62f, -56.56f, 0f)
                lineTo(138.47f, 115.84f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0f, 22.63f)
                lineToRelative(22.62f, 22.62f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0f)
                lineToRelative(87.15f, -87.15f)
                lineToRelative(19.59f, 19.59f)
                lineTo(191.98f, 192f)
                lineTo(320f, 320.02f)
                lineToRelative(165.49f, -165.49f)
                curveToRelative(35.35f, -35.35f, 35.35f, -92.66f, 0f, -128.02f)
                close()
            }
        }.build()
        
        return _Marker!!
    }

private var _Marker: ImageVector? = null

