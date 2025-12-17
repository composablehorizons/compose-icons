package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Gitlab: ImageVector
    get() {
        if (_Gitlab != null) return _Gitlab!!
        
        _Gitlab = ImageVector.Builder(
            name = "gitlab",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(105.2f, 24.9f)
                curveToRelative(-3.1f, -8.9f, -15.7f, -8.9f, -18.9f, 0f)
                lineTo(29.8f, 199.7f)
                horizontalLineToRelative(132f)
                curveToRelative(-0.1f, 0f, -56.6f, -174.8f, -56.6f, -174.8f)
                close()
                moveTo(0.9f, 287.7f)
                curveToRelative(-2.6f, 8f, 0.3f, 16.9f, 7.1f, 22f)
                lineToRelative(247.9f, 184f)
                lineToRelative(-226.2f, -294f)
                close()
                moveToRelative(160.8f, -88f)
                lineToRelative(94.3f, 294f)
                lineToRelative(94.3f, -294f)
                close()
                moveToRelative(349.4f, 88f)
                lineToRelative(-28.8f, -88f)
                lineToRelative(-226.3f, 294f)
                lineToRelative(247.9f, -184f)
                curveToRelative(6.9f, -5.1f, 9.7f, -14f, 7.2f, -22f)
                close()
                moveTo(425.7f, 24.9f)
                curveToRelative(-3.1f, -8.9f, -15.7f, -8.9f, -18.9f, 0f)
                lineToRelative(-56.6f, 174.8f)
                horizontalLineToRelative(132f)
                close()
            }
        }.build()
        
        return _Gitlab!!
    }

private var _Gitlab: ImageVector? = null

