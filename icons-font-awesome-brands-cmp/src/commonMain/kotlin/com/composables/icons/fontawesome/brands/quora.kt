package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Quora: ImageVector
    get() {
        if (_Quora != null) return _Quora!!
        
        _Quora = ImageVector.Builder(
            name = "quora",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440.5f, 386.7f)
                horizontalLineToRelative(-29.3f)
                curveToRelative(-1.5f, 13.5f, -10.5f, 30.8f, -33f, 30.8f)
                curveToRelative(-20.5f, 0f, -35.3f, -14.2f, -49.5f, -35.8f)
                curveToRelative(44.2f, -34.2f, 74.7f, -87.5f, 74.7f, -153f)
                curveTo(403.5f, 111.2f, 306.8f, 32f, 205f, 32f)
                curveTo(105.3f, 32f, 7.3f, 111.7f, 7.3f, 228.7f)
                curveToRelative(0f, 134.1f, 131.3f, 221.6f, 249f, 189f)
                curveTo(276f, 451.3f, 302f, 480f, 351.5f, 480f)
                curveToRelative(81.8f, 0f, 90.8f, -75.3f, 89f, -93.3f)
                close()
                moveTo(297f, 329.2f)
                curveTo(277.5f, 300f, 253.3f, 277f, 205.5f, 277f)
                curveToRelative(-30.5f, 0f, -54.3f, 10f, -69f, 22.8f)
                lineToRelative(12.2f, 24.3f)
                curveToRelative(6.2f, -3f, 13f, -4f, 19.8f, -4f)
                curveToRelative(35.5f, 0f, 53.7f, 30.8f, 69.2f, 61.3f)
                curveToRelative(-10f, 3f, -20.7f, 4.2f, -32.7f, 4.2f)
                curveToRelative(-75f, 0f, -107.5f, -53f, -107.5f, -156.7f)
                curveTo(97.5f, 124.5f, 130f, 71f, 205f, 71f)
                curveToRelative(76.2f, 0f, 108.7f, 53.5f, 108.7f, 157.7f)
                curveToRelative(0.1f, 41.8f, -5.4f, 75.6f, -16.7f, 100.5f)
                close()
            }
        }.build()
        
        return _Quora!!
    }

private var _Quora: ImageVector? = null

