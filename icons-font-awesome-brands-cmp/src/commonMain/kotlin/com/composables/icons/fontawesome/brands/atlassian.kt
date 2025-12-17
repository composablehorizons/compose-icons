package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Atlassian: ImageVector
    get() {
        if (_Atlassian != null) return _Atlassian!!
        
        _Atlassian = ImageVector.Builder(
            name = "atlassian",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(152.2f, 236.4f)
                curveToRelative(-7.7f, -8.2f, -19.7f, -7.7f, -24.8f, 2.8f)
                lineTo(1.6f, 490.2f)
                curveToRelative(-5f, 10f, 2.4f, 21.7f, 13.4f, 21.7f)
                horizontalLineToRelative(175f)
                curveToRelative(5.8f, 0.1f, 11f, -3.2f, 13.4f, -8.4f)
                curveToRelative(37.9f, -77.8f, 15.1f, -196.3f, -51.2f, -267.1f)
                close()
                moveTo(244.4f, 8.1f)
                curveToRelative(-122.3f, 193.4f, -8.5f, 348.6f, 65f, 495.5f)
                curveToRelative(2.5f, 5.1f, 7.7f, 8.4f, 13.4f, 8.4f)
                horizontalLineTo(497f)
                curveToRelative(11.2f, 0f, 18.4f, -11.8f, 13.4f, -21.7f)
                curveToRelative(0f, 0f, -234.5f, -470.6f, -240.4f, -482.3f)
                curveToRelative(-5.3f, -10.6f, -18.8f, -10.8f, -25.6f, 0.1f)
                close()
            }
        }.build()
        
        return _Atlassian!!
    }

private var _Atlassian: ImageVector? = null

