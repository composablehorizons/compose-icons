package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.WineBottle: ImageVector
    get() {
        if (_WineBottle != null) return _WineBottle!!
        
        _WineBottle = ImageVector.Builder(
            name = "wine-bottle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(507.31f, 72.57f)
                lineTo(439.43f, 4.69f)
                curveToRelative(-6.25f, -6.25f, -16.38f, -6.25f, -22.63f, 0f)
                lineToRelative(-22.63f, 22.63f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0f, 22.63f)
                lineToRelative(-76.67f, 76.67f)
                curveToRelative(-46.58f, -19.7f, -102.4f, -10.73f, -140.37f, 27.23f)
                lineTo(18.75f, 312.23f)
                curveToRelative(-24.99f, 24.99f, -24.99f, 65.52f, 0f, 90.51f)
                lineToRelative(90.51f, 90.51f)
                curveToRelative(24.99f, 24.99f, 65.52f, 24.99f, 90.51f, 0f)
                lineToRelative(158.39f, -158.39f)
                curveToRelative(37.96f, -37.96f, 46.93f, -93.79f, 27.23f, -140.37f)
                lineToRelative(76.67f, -76.67f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0f)
                lineToRelative(22.63f, -22.63f)
                curveToRelative(6.24f, -6.24f, 6.24f, -16.37f, -0.01f, -22.62f)
                close()
                moveTo(179.22f, 423.29f)
                lineToRelative(-90.51f, -90.51f)
                lineToRelative(122.04f, -122.04f)
                lineToRelative(90.51f, 90.51f)
                lineToRelative(-122.04f, 122.04f)
                close()
            }
        }.build()
        
        return _WineBottle!!
    }

private var _WineBottle: ImageVector? = null

