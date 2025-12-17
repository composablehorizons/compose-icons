package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Verified: ImageVector
    get() {
        if (_Verified != null) return _Verified!!
        
        _Verified = ImageVector.Builder(
            name = "verified",
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
                lineToRelative(-14f, -148f)
                lineToRelative(144f, -32f)
                lineToRelative(76f, -128f)
                lineToRelative(136f, 58f)
                lineToRelative(136f, -58f)
                lineToRelative(76f, 128f)
                lineToRelative(144f, 32f)
                lineToRelative(-14f, 148f)
                lineToRelative(98f, 112f)
                lineToRelative(-98f, 112f)
                lineToRelative(14f, 148f)
                lineToRelative(-144f, 32f)
                lineToRelative(-76f, 128f)
                lineToRelative(-136f, -58f)
                lineToRelative(-136f, 58f)
                close()
                moveToRelative(34f, -102f)
                lineToRelative(102f, -44f)
                lineToRelative(104f, 44f)
                lineToRelative(56f, -96f)
                lineToRelative(110f, -26f)
                lineToRelative(-10f, -112f)
                lineToRelative(74f, -84f)
                lineToRelative(-74f, -86f)
                lineToRelative(10f, -112f)
                lineToRelative(-110f, -24f)
                lineToRelative(-58f, -96f)
                lineToRelative(-102f, 44f)
                lineToRelative(-104f, -44f)
                lineToRelative(-56f, 96f)
                lineToRelative(-110f, 24f)
                lineToRelative(10f, 112f)
                lineToRelative(-74f, 86f)
                lineToRelative(74f, 84f)
                lineToRelative(-10f, 114f)
                lineToRelative(110f, 24f)
                lineToRelative(58f, 96f)
                close()
                moveToRelative(102f, -318f)
                close()
                moveToRelative(-42f, 142f)
                lineToRelative(226f, -226f)
                lineToRelative(-56f, -58f)
                lineToRelative(-170f, 170f)
                lineToRelative(-86f, -84f)
                lineToRelative(-56f, 56f)
                lineToRelative(142f, 142f)
                close()
            }
        }.build()
        
        return _Verified!!
    }

private var _Verified: ImageVector? = null

