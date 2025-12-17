package com.composables.icons.codicons

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

val Codicons.Blank: ImageVector
    get() {
        if (_Blank != null) return _Blank!!
        
        _Blank = ImageVector.Builder(
            name = "blank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
        }.build()
        
        return _Blank!!
    }

private var _Blank: ImageVector? = null

