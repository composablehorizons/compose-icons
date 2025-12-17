package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Verified_off: ImageVector
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
                moveTo(586f, 474f)
                lineToRelative(78f, -78f)
                lineToRelative(-56f, -58f)
                lineToRelative(-79f, 79f)
                lineToRelative(57f, 57f)
                close()
                moveToRelative(248f, 248f)
                lineToRelative(-88f, -88f)
                lineToRelative(-6f, -70f)
                lineToRelative(74f, -84f)
                lineToRelative(-74f, -86f)
                lineToRelative(10f, -112f)
                lineToRelative(-110f, -24f)
                lineToRelative(-58f, -96f)
                lineToRelative(-102f, 44f)
                lineToRelative(-104f, -44f)
                lineToRelative(-37f, 64f)
                lineToRelative(-59f, -59f)
                lineToRelative(64f, -107f)
                lineToRelative(136f, 58f)
                lineToRelative(136f, -58f)
                lineToRelative(76f, 128f)
                lineToRelative(144f, 32f)
                lineToRelative(-14f, 148f)
                lineToRelative(98f, 112f)
                lineToRelative(-98f, 112f)
                lineToRelative(12f, 130f)
                close()
                moveToRelative(-456f, 76f)
                lineToRelative(102f, -44f)
                lineToRelative(104f, 44f)
                lineToRelative(38f, -64f)
                lineToRelative(-148f, -148f)
                lineToRelative(-36f, 36f)
                lineToRelative(-142f, -142f)
                lineToRelative(56f, -56f)
                lineToRelative(86f, 84f)
                lineToRelative(-21f, 21f)
                lineToRelative(-203f, -203f)
                lineToRelative(6f, 68f)
                lineToRelative(-74f, 86f)
                lineToRelative(74f, 84f)
                lineToRelative(-10f, 114f)
                lineToRelative(110f, 24f)
                lineToRelative(58f, 96f)
                close()
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
                moveToRelative(185f, -483f)
                close()
                moveToRelative(-145f, 79f)
                close()
            }
        }.build()
        
        return _Verified_off!!
    }

private var _Verified_off: ImageVector? = null

