package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.GlobeAmericas: ImageVector
    get() {
        if (_GlobeAmericas != null) return _GlobeAmericas!!
        
        _GlobeAmericas = ImageVector.Builder(
            name = "globe-americas",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 10f)
                arcToRelative(8f, 8f, 0f, true, true, -16f, 0f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                close()
                moveToRelative(-1.5f, 0f)
                arcToRelative(6.5f, 6.5f, 0f, true, true, -11f, -4.69f)
                verticalLineToRelative(0.447f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 1.025f, 2.475f)
                lineTo(8.293f, 10f)
                lineTo(8f, 10.293f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.414f)
                lineToRelative(1.06f, 1.06f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.44f, 1.061f)
                verticalLineToRelative(0.363f)
                arcToRelative(1f, 1f, 0f, false, false, 0.553f, 0.894f)
                lineToRelative(0.276f, 0.139f)
                arcToRelative(1f, 1f, 0f, false, false, 1.342f, -0.448f)
                lineToRelative(1.454f, -2.908f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.281f, -1.731f)
                lineToRelative(-0.772f, -0.772f)
                arcToRelative(1f, 1f, 0f, false, false, -1.023f, -0.242f)
                lineToRelative(-0.384f, 0.128f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.606f, -0.25f)
                lineToRelative(-0.296f, -0.592f)
                arcToRelative(0.481f, 0.481f, 0f, false, true, 0.646f, -0.646f)
                lineToRelative(0.262f, 0.131f)
                arcToRelative(1f, 1f, 0f, false, false, 0.447f, 0.106f)
                horizontalLineToRelative(0.188f)
                arcToRelative(1f, 1f, 0f, false, false, 0.949f, -1.316f)
                lineToRelative(-0.068f, -0.204f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.149f, -0.538f)
                lineToRelative(1.44f, -1.234f)
                arcTo(6.492f, 6.492f, 0f, false, true, 16.5f, 10f)
                close()
            }
        }.build()
        
        return _GlobeAmericas!!
    }

private var _GlobeAmericas: ImageVector? = null

