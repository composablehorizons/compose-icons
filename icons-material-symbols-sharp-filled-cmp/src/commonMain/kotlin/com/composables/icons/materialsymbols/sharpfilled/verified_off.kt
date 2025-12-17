package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Verified_off: ImageVector
    get() {
        if (_Verified_off != null) return _Verified_off!!
        
        _Verified_off = ImageVector.Builder(
            name = "verified_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(344f, 900f)
                lineToRelative(-76f, -128f)
                lineToRelative(-144f, -32f)
                lineToRelative(14f, -148f)
                lineToRelative(-98f, -112f)
                lineToRelative(98f, -112f)
                lineToRelative(-12f, -130f)
                lineToRelative(-70f, -70f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                lineToRelative(-112f, -112f)
                lineToRelative(-64f, 108f)
                lineToRelative(-136f, -58f)
                lineToRelative(-136f, 58f)
                close()
                moveToRelative(478f, -308f)
                lineToRelative(12f, 130f)
                lineToRelative(-248f, -248f)
                lineToRelative(78f, -78f)
                lineToRelative(-56f, -58f)
                lineToRelative(-79f, 79f)
                lineToRelative(-249f, -250f)
                lineToRelative(64f, -107f)
                lineToRelative(136f, 58f)
                lineToRelative(136f, -58f)
                lineToRelative(76f, 128f)
                lineToRelative(144f, 32f)
                lineToRelative(-14f, 148f)
                lineToRelative(98f, 112f)
                lineToRelative(-98f, 112f)
                close()
                moveToRelative(-384f, 30f)
                lineToRelative(36f, -36f)
                lineToRelative(-51f, -51f)
                lineToRelative(-91f, -91f)
                lineToRelative(-36f, 36f)
                lineToRelative(142f, 142f)
                close()
            }
        }.build()
        
        return _Verified_off!!
    }

private var _Verified_off: ImageVector? = null

