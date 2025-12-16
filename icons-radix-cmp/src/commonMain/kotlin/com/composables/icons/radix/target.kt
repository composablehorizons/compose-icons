package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Target: ImageVector
    get() {
        if (_Target != null) return _Target!!
        
        _Target = ImageVector.Builder(
            name = "target",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.50061f, 0.899994f)
                curveTo(11.1454f, 0.900311f, 14.1002f, 3.8557f, 14.1002f, 7.50058f)
                curveTo(14.0999f, 11.1452f, 11.1452f, 14.0999f, 7.50061f, 14.1002f)
                curveTo(3.85573f, 14.1002f, 0.900341f, 11.1454f, 0.900024f, 7.50058f)
                curveTo(0.900024f, 3.8555f, 3.85554f, 0.899994f, 7.50061f, 0.899994f)
                close()
                moveTo(7.50061f, 1.80038f)
                curveTo(4.35259f, 1.80038f, 1.80042f, 4.35256f, 1.80042f, 7.50058f)
                curveTo(1.80073f, 10.6483f, 4.35279f, 13.1998f, 7.50061f, 13.1998f)
                curveTo(10.6481f, 13.1995f, 13.1995f, 10.6481f, 13.1998f, 7.50058f)
                curveTo(13.1998f, 4.35276f, 10.6483f, 1.8007f, 7.50061f, 1.80038f)
                close()
                moveTo(7.49963f, 3.0748f)
                curveTo(9.94334f, 3.0748f, 11.9242f, 5.05592f, 11.9244f, 7.4996f)
                curveTo(11.9244f, 9.94344f, 9.94347f, 11.9244f, 7.49963f, 11.9244f)
                curveTo(5.05596f, 11.9242f, 3.07483f, 9.94331f, 3.07483f, 7.4996f)
                curveTo(3.07504f, 5.05606f, 5.05609f, 3.07502f, 7.49963f, 3.0748f)
                close()
                moveTo(7.49963f, 3.92441f)
                curveTo(5.52554f, 3.92463f, 3.92465f, 5.5255f, 3.92444f, 7.4996f)
                curveTo(3.92444f, 9.47387f, 5.52541f, 11.0746f, 7.49963f, 11.0748f)
                curveTo(9.47403f, 11.0748f, 11.0748f, 9.474f, 11.0748f, 7.4996f)
                curveTo(11.0746f, 5.52537f, 9.4739f, 3.92441f, 7.49963f, 3.92441f)
                close()
                moveTo(7.49963f, 5.2496f)
                curveTo(8.74213f, 5.2496f, 9.74942f, 6.25714f, 9.74963f, 7.4996f)
                curveTo(9.74963f, 8.74224f, 8.74227f, 9.7496f, 7.49963f, 9.7496f)
                curveTo(6.25718f, 9.74938f, 5.24963f, 8.7421f, 5.24963f, 7.4996f)
                curveTo(5.24985f, 6.25728f, 6.25731f, 5.24982f, 7.49963f, 5.2496f)
                close()
                moveTo(7.49963f, 6.05038f)
                curveTo(6.69914f, 6.0506f, 6.05063f, 6.69911f, 6.05042f, 7.4996f)
                curveTo(6.05042f, 8.30027f, 6.69901f, 8.94958f, 7.49963f, 8.9498f)
                curveTo(8.30044f, 8.9498f, 8.94983f, 8.30041f, 8.94983f, 7.4996f)
                curveTo(8.94962f, 6.69897f, 8.30031f, 6.05038f, 7.49963f, 6.05038f)
                close()
            }
        }.build()
        
        return _Target!!
    }

private var _Target: ImageVector? = null

