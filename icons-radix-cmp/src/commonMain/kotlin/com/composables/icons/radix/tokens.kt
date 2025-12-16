package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Tokens: ImageVector
    get() {
        if (_Tokens != null) return _Tokens!!
        
        _Tokens = ImageVector.Builder(
            name = "tokens",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 8f)
                curveTo(5.88072f, 8f, 7f, 9.11929f, 7f, 10.5f)
                curveTo(7f, 11.8807f, 5.88072f, 13f, 4.5f, 13f)
                curveTo(3.11929f, 13f, 2f, 11.8807f, 2f, 10.5f)
                curveTo(2f, 9.11929f, 3.11929f, 8f, 4.5f, 8f)
                close()
                moveTo(10.5f, 8f)
                curveTo(11.8807f, 8f, 13f, 9.11929f, 13f, 10.5f)
                curveTo(13f, 11.8807f, 11.8807f, 13f, 10.5f, 13f)
                curveTo(9.11929f, 13f, 8f, 11.8807f, 8f, 10.5f)
                curveTo(8f, 9.11929f, 9.11929f, 8f, 10.5f, 8f)
                close()
                moveTo(4.5f, 9f)
                curveTo(3.67157f, 9f, 3f, 9.67157f, 3f, 10.5f)
                curveTo(3f, 11.3284f, 3.67157f, 12f, 4.5f, 12f)
                curveTo(5.32843f, 12f, 6f, 11.3284f, 6f, 10.5f)
                curveTo(6f, 9.67157f, 5.32843f, 9f, 4.5f, 9f)
                close()
                moveTo(10.5f, 9f)
                curveTo(9.67157f, 9f, 9f, 9.67157f, 9f, 10.5f)
                curveTo(9f, 11.3284f, 9.67157f, 12f, 10.5f, 12f)
                curveTo(11.3284f, 12f, 12f, 11.3284f, 12f, 10.5f)
                curveTo(12f, 9.67157f, 11.3284f, 9f, 10.5f, 9f)
                close()
                moveTo(4.5f, 2f)
                curveTo(5.88072f, 2f, 7f, 3.11929f, 7f, 4.5f)
                curveTo(7f, 5.88072f, 5.88072f, 7f, 4.5f, 7f)
                curveTo(3.11929f, 7f, 2f, 5.88072f, 2f, 4.5f)
                curveTo(2f, 3.11929f, 3.11929f, 2f, 4.5f, 2f)
                close()
                moveTo(10.5f, 2f)
                curveTo(11.8807f, 2f, 13f, 3.11929f, 13f, 4.5f)
                curveTo(13f, 5.88072f, 11.8807f, 7f, 10.5f, 7f)
                curveTo(9.11929f, 7f, 8f, 5.88072f, 8f, 4.5f)
                curveTo(8f, 3.11929f, 9.11929f, 2f, 10.5f, 2f)
                close()
                moveTo(4.5f, 3f)
                curveTo(3.67157f, 3f, 3f, 3.67157f, 3f, 4.5f)
                curveTo(3f, 5.32843f, 3.67157f, 6f, 4.5f, 6f)
                curveTo(5.32843f, 6f, 6f, 5.32843f, 6f, 4.5f)
                curveTo(6f, 3.67157f, 5.32843f, 3f, 4.5f, 3f)
                close()
                moveTo(10.5f, 3f)
                curveTo(9.67157f, 3f, 9f, 3.67157f, 9f, 4.5f)
                curveTo(9f, 5.32843f, 9.67157f, 6f, 10.5f, 6f)
                curveTo(11.3284f, 6f, 12f, 5.32843f, 12f, 4.5f)
                curveTo(12f, 3.67157f, 11.3284f, 3f, 10.5f, 3f)
                close()
            }
        }.build()
        
        return _Tokens!!
    }

private var _Tokens: ImageVector? = null

