package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Burn: ImageVector
    get() {
        if (_Burn != null) return _Burn!!
        
        _Burn = ImageVector.Builder(
            name = "burn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(192f, 0f)
                curveTo(79.7f, 101.3f, 0f, 220.9f, 0f, 300.5f)
                curveTo(0f, 425f, 79f, 512f, 192f, 512f)
                reflectiveCurveToRelative(192f, -87f, 192f, -211.5f)
                curveToRelative(0f, -79.9f, -80.2f, -199.6f, -192f, -300.5f)
                close()
                moveToRelative(0f, 448f)
                curveToRelative(-56.5f, 0f, -96f, -39f, -96f, -94.8f)
                curveToRelative(0f, -13.5f, 4.6f, -61.5f, 96f, -161.2f)
                curveToRelative(91.4f, 99.7f, 96f, 147.7f, 96f, 161.2f)
                curveToRelative(0f, 55.8f, -39.5f, 94.8f, -96f, 94.8f)
                close()
            }
        }.build()
        
        return _Burn!!
    }

private var _Burn: ImageVector? = null

