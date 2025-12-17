package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Store: ImageVector
    get() {
        if (_Store != null) return _Store!!
        
        _Store = ImageVector.Builder(
            name = "store",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 616f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(602f, 118.6f)
                lineTo(537.1f, 15f)
                curveTo(531.3f, 5.7f, 521f, 0f, 510f, 0f)
                horizontalLineTo(106f)
                curveTo(95f, 0f, 84.7f, 5.7f, 78.9f, 15f)
                lineTo(14f, 118.6f)
                curveToRelative(-33.5f, 53.5f, -3.8f, 127.9f, 58.8f, 136.4f)
                curveToRelative(4.5f, 0.6f, 9.1f, 0.9f, 13.7f, 0.9f)
                curveToRelative(29.6f, 0f, 55.8f, -13f, 73.8f, -33.1f)
                curveToRelative(18f, 20.1f, 44.3f, 33.1f, 73.8f, 33.1f)
                curveToRelative(29.6f, 0f, 55.8f, -13f, 73.8f, -33.1f)
                curveToRelative(18f, 20.1f, 44.3f, 33.1f, 73.8f, 33.1f)
                curveToRelative(29.6f, 0f, 55.8f, -13f, 73.8f, -33.1f)
                curveToRelative(18.1f, 20.1f, 44.3f, 33.1f, 73.8f, 33.1f)
                curveToRelative(4.7f, 0f, 9.2f, -0.3f, 13.7f, -0.9f)
                curveToRelative(62.8f, -8.4f, 92.6f, -82.8f, 59f, -136.4f)
                close()
                moveTo(529.5f, 288f)
                curveToRelative(-10f, 0f, -19.9f, -1.5f, -29.5f, -3.8f)
                verticalLineTo(384f)
                horizontalLineTo(116f)
                verticalLineToRelative(-99.8f)
                curveToRelative(-9.6f, 2.2f, -19.5f, 3.8f, -29.5f, 3.8f)
                curveToRelative(-6f, 0f, -12.1f, -0.4f, -18f, -1.2f)
                curveToRelative(-5.6f, -0.8f, -11.1f, -2.1f, -16.4f, -3.6f)
                verticalLineTo(480f)
                curveToRelative(0f, 17.7f, 14.3f, 32f, 32f, 32f)
                horizontalLineToRelative(448f)
                curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                verticalLineTo(283.2f)
                curveToRelative(-5.4f, 1.6f, -10.8f, 2.9f, -16.4f, 3.6f)
                curveToRelative(-6.1f, 0.8f, -12.1f, 1.2f, -18.2f, 1.2f)
                close()
            }
        }.build()
        
        return _Store!!
    }

private var _Store: ImageVector? = null

