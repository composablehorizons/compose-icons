package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Typo3: ImageVector
    get() {
        if (_Typo3 != null) return _Typo3!!
        
        _Typo3 = ImageVector.Builder(
            name = "typo3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(178.7f, 78.4f)
                curveToRelative(0f, -24.7f, 5.4f, -32.4f, 13.9f, -39.4f)
                curveToRelative(-69.5f, 8.5f, -149.3f, 34f, -176.3f, 66.4f)
                curveToRelative(-5.4f, 7.7f, -9.3f, 20.8f, -9.3f, 37.1f)
                curveTo(7f, 246f, 113.8f, 480f, 191.1f, 480f)
                curveToRelative(36.3f, 0f, 97.3f, -59.5f, 146.7f, -139f)
                curveToRelative(-7f, 2.3f, -11.6f, 2.3f, -18.5f, 2.3f)
                curveToRelative(-57.2f, 0f, -140.6f, -198.5f, -140.6f, -264.9f)
                close()
                moveTo(301.5f, 32f)
                curveToRelative(-30.1f, 0f, -41.7f, 5.4f, -41.7f, 36.3f)
                curveToRelative(0f, 66.4f, 53.8f, 198.5f, 101.7f, 198.5f)
                curveToRelative(26.3f, 0f, 78.8f, -99.7f, 78.8f, -182.3f)
                curveToRelative(0f, -40.9f, -67f, -52.5f, -138.8f, -52.5f)
                close()
            }
        }.build()
        
        return _Typo3!!
    }

private var _Typo3: ImageVector? = null

