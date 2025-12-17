package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Butterfly: ImageVector
    get() {
        if (_Butterfly != null) return _Butterfly!!
        
        _Butterfly = ImageVector.Builder(
            name = "butterfly",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.117f, 6.244f)
                lineToRelative(0.228f, 0.076f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 1.24f, 9.738f)
                lineToRelative(-0.063f, 0.039f)
                lineToRelative(0.02f, 0.034f)
                arcToRelative(4f, 4f, 0f, false, true, 0.101f, 3.533f)
                lineToRelative(-0.093f, 0.19f)
                arcToRelative(4f, 4f, 0f, false, true, -5.55f, 1.608f)
                verticalLineToRelative(-14.857f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 4.118f, -0.36f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.505f, 6f)
                curveToRelative(0.885f, 0f, 1.736f, 0.21f, 2.495f, 0.597f)
                verticalLineToRelative(14.87f)
                arcToRelative(4f, 4f, 0f, false, true, -1.012f, 0.41f)
                lineToRelative(-0.196f, 0.045f)
                arcToRelative(4f, 4f, 0f, false, true, -4.424f, -5.587f)
                lineToRelative(0.118f, -0.238f)
                lineToRelative(-0.035f, -0.023f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, -2.397f, -5.258f)
                lineToRelative(0.034f, -0.233f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 5.417f, -4.583f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.445f, 2.168f)
                arcToRelative(1f, 1f, 0f, false, true, 1.11f, 1.664f)
                lineToRelative(-3f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, -1.11f, 0f)
                lineToRelative(-3f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 1.11f, -1.664f)
                lineToRelative(2.444f, 1.63f)
                close()
            }
        }.build()
        
        return _Butterfly!!
    }

private var _Butterfly: ImageVector? = null

