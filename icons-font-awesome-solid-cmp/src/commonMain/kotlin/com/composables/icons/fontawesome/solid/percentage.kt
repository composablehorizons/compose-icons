package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Percentage: ImageVector
    get() {
        if (_Percentage != null) return _Percentage!!
        
        _Percentage = ImageVector.Builder(
            name = "percentage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(109.25f, 173.25f)
                curveToRelative(24.99f, -24.99f, 24.99f, -65.52f, 0f, -90.51f)
                curveToRelative(-24.99f, -24.99f, -65.52f, -24.99f, -90.51f, 0f)
                curveToRelative(-24.99f, 24.99f, -24.99f, 65.52f, 0f, 90.51f)
                curveToRelative(25f, 25f, 65.52f, 25f, 90.51f, 0f)
                close()
                moveToRelative(256f, 165.49f)
                curveToRelative(-24.99f, -24.99f, -65.52f, -24.99f, -90.51f, 0f)
                curveToRelative(-24.99f, 24.99f, -24.99f, 65.52f, 0f, 90.51f)
                curveToRelative(24.99f, 24.99f, 65.52f, 24.99f, 90.51f, 0f)
                curveToRelative(25f, -24.99f, 25f, -65.51f, 0f, -90.51f)
                close()
                moveToRelative(-1.94f, -231.43f)
                lineToRelative(-22.62f, -22.62f)
                curveToRelative(-12.5f, -12.5f, -32.76f, -12.5f, -45.25f, 0f)
                lineTo(20.69f, 359.44f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.76f, 0f, 45.25f)
                lineToRelative(22.62f, 22.62f)
                curveToRelative(12.5f, 12.5f, 32.76f, 12.5f, 45.25f, 0f)
                lineToRelative(274.75f, -274.75f)
                curveToRelative(12.5f, -12.49f, 12.5f, -32.75f, 0f, -45.25f)
                close()
            }
        }.build()
        
        return _Percentage!!
    }

private var _Percentage: ImageVector? = null

