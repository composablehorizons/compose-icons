package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.HexagonLetterE: ImageVector
    get() {
        if (_HexagonLetterE != null) return _HexagonLetterE!!
        
        _HexagonLetterE = ImageVector.Builder(
            name = "hexagon-letter-e",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.666f, 1.429f)
                lineToRelative(6.75f, 3.98f)
                lineToRelative(0.096f, 0.063f)
                lineToRelative(0.093f, 0.078f)
                lineToRelative(0.106f, 0.074f)
                arcToRelative(3.22f, 3.22f, 0f, false, true, 1.284f, 2.39f)
                lineToRelative(0.005f, 0.204f)
                verticalLineToRelative(7.284f)
                curveToRelative(0f, 1.175f, -0.643f, 2.256f, -1.623f, 2.793f)
                lineToRelative(-6.804f, 4.302f)
                curveToRelative(-0.98f, 0.538f, -2.166f, 0.538f, -3.2f, -0.032f)
                lineToRelative(-6.695f, -4.237f)
                arcToRelative(3.23f, 3.23f, 0f, false, true, -1.678f, -2.826f)
                verticalLineToRelative(-7.285f)
                curveToRelative(0f, -1.106f, 0.57f, -2.128f, 1.476f, -2.705f)
                lineToRelative(6.95f, -4.098f)
                curveToRelative(1f, -0.552f, 2.214f, -0.552f, 3.24f, 0.015f)
                moveToRelative(0.334f, 5.571f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.5f)
                arcToRelative(1f, 1f, 0f, false, false, 0.993f, -0.883f)
                lineToRelative(0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
            }
        }.build()
        
        return _HexagonLetterE!!
    }

private var _HexagonLetterE: ImageVector? = null

