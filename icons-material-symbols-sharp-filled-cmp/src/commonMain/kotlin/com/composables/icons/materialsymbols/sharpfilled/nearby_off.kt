package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Nearby_off: ImageVector
    get() {
        if (_Nearby_off != null) return _Nearby_off!!
        
        _Nearby_off = ImageVector.Builder(
            name = "nearby_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(752f, 640f)
                lineToRelative(-72f, -72f)
                lineToRelative(88f, -88f)
                lineToRelative(-288f, -288f)
                lineToRelative(-88f, 88f)
                lineToRelative(-72f, -72f)
                lineToRelative(160f, -160f)
                lineToRelative(432f, 432f)
                lineToRelative(-160f, 160f)
                close()
                moveTo(479f, 911f)
                lineTo(49f, 481f)
                lineToRelative(159f, -160f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-55f, 55f)
                lineToRelative(-151f, -151f)
                lineTo(479f, 911f)
                close()
                moveToRelative(1f, -143f)
                lineToRelative(90f, -88f)
                lineToRelative(-57f, -57f)
                lineToRelative(-33f, 33f)
                lineToRelative(-175f, -175f)
                lineToRelative(33f, -33f)
                lineToRelative(-56f, -56f)
                lineToRelative(-89f, 89f)
                lineToRelative(287f, 287f)
                close()
                moveToRelative(144f, -256f)
                lineTo(448f, 336f)
                lineToRelative(32f, -32f)
                lineToRelative(176f, 176f)
                lineToRelative(-32f, 32f)
                close()
            }
        }.build()
        
        return _Nearby_off!!
    }

private var _Nearby_off: ImageVector? = null

