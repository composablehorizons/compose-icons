package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Meteor: ImageVector
    get() {
        if (_Meteor != null) return _Meteor!!
        
        _Meteor = ImageVector.Builder(
            name = "meteor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(511.328f, 20.8027f)
                curveToRelative(-11.60759f, 38.70264f, -34.30724f, 111.70173f, -61.30311f, 187.70078f)
                curveToRelative(6.99893f, 2.09372f, 13.4042f, 4f, 18.60653f, 5.59368f)
                arcToRelative(16.06158f, 16.06158f, 0f, false, true, 9.49854f, 22.906f)
                curveToRelative(-22.106f, 42.29635f, -82.69047f, 152.795f, -142.4782f, 214.40356f)
                curveToRelative(-0.99984f, 1.09373f, -1.99969f, 2.5f, -2.99954f, 3.49995f)
                arcTo(194.83046f, 194.83046f, 0f, true, true, 57.085f, 179.4101f)
                curveToRelative(0.99985f, -1f, 2.40588f, -2f, 3.49947f, -3f)
                curveToRelative(61.59994f, -59.90549f, 171.97366f, -120.40473f, 214.37343f, -142.4982f)
                arcToRelative(16.058f, 16.058f, 0f, false, true, 22.90274f, 9.49988f)
                curveToRelative(1.59351f, 5.09368f, 3.49947f, 11.5936f, 5.5929f, 18.59351f)
                curveTo(379.34818f, 35.00565f, 452.43073f, 12.30281f, 491.12793f, 0.70921f)
                arcTo(16.18325f, 16.18325f, 0f, false, true, 511.328f, 20.8027f)
                close()
                moveTo(319.951f, 320.00208f)
                arcTo(127.98041f, 127.98041f, 0f, true, false, 191.97061f, 448.00046f)
                arcTo(127.97573f, 127.97573f, 0f, false, false, 319.951f, 320.00208f)
                close()
                moveToRelative(-127.98041f, -31.9996f)
                arcToRelative(31.9951f, 31.9951f, 0f, true, true, -31.9951f, -31.9996f)
                arcTo(31.959f, 31.959f, 0f, false, true, 191.97061f, 288.00247f)
                close()
                moveToRelative(31.9951f, 79.999f)
                arcToRelative(15.99755f, 15.99755f, 0f, true, true, -15.99755f, -15.9998f)
                arcTo(16.04975f, 16.04975f, 0f, false, true, 223.96571f, 368.00146f)
                close()
            }
        }.build()
        
        return _Meteor!!
    }

private var _Meteor: ImageVector? = null

