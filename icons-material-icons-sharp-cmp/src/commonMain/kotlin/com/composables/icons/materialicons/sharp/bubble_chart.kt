package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Bubble_chart: ImageVector
    get() {
        if (_Bubble_chart != null) return _Bubble_chart!!
        
        _Bubble_chart = ImageVector.Builder(
            name = "bubble_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.4f, 14.4f)
                arcTo(3.2f, 3.2f, 0f, false, true, 7.2f, 17.6f)
                arcTo(3.2f, 3.2f, 0f, false, true, 4f, 14.4f)
                arcTo(3.2f, 3.2f, 0f, false, true, 10.4f, 14.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.8f, 18f)
                arcTo(2f, 2f, 0f, false, true, 14.8f, 20f)
                arcTo(2f, 2f, 0f, false, true, 12.8f, 18f)
                arcTo(2f, 2f, 0f, false, true, 16.8f, 18f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 8.8f)
                arcTo(4.8f, 4.8f, 0f, false, true, 15.2f, 13.6f)
                arcTo(4.8f, 4.8f, 0f, false, true, 10.4f, 8.8f)
                arcTo(4.8f, 4.8f, 0f, false, true, 20f, 8.8f)
                close()
            }
        }.build()
        
        return _Bubble_chart!!
    }

private var _Bubble_chart: ImageVector? = null

