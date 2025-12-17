package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.No_photography: ImageVector
    get() {
        if (_No_photography != null) return _No_photography!!
        
        _No_photography = ImageVector.Builder(
            name = "no_photography",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(880f, 765f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-405f)
                horizontalLineTo(638f)
                lineToRelative(-73f, -80f)
                horizontalLineTo(395f)
                lineToRelative(-38f, 42f)
                lineToRelative(-57f, -57f)
                lineToRelative(60f, -65f)
                horizontalLineToRelative(240f)
                lineToRelative(74f, 80f)
                horizontalLineToRelative(206f)
                verticalLineToRelative(565f)
                close()
                moveTo(80f, 840f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(121f)
                lineToRelative(80f, 80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(601f)
                lineToRelative(80f, 80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(546f, -215f)
                quadToRelative(-25f, 34f, -62.5f, 54.5f)
                reflectiveQuadTo(480f, 700f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(300f, 520f)
                quadToRelative(0f, -46f, 20.5f, -83.5f)
                reflectiveQuadTo(375f, 374f)
                lineToRelative(58f, 58f)
                quadToRelative(-24f, 13f, -38.5f, 36f)
                reflectiveQuadTo(380f, 520f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                quadToRelative(29f, 0f, 52f, -14.5f)
                reflectiveQuadToRelative(36f, -38.5f)
                lineToRelative(58f, 58f)
                close()
                moveToRelative(-18f, -233f)
                quadToRelative(25f, 24f, 38.5f, 57f)
                reflectiveQuadToRelative(13.5f, 71f)
                verticalLineToRelative(12f)
                quadToRelative(0f, 6f, -1f, 12f)
                lineTo(456f, 341f)
                quadToRelative(6f, -1f, 12f, -1f)
                horizontalLineToRelative(12f)
                quadToRelative(38f, 0f, 71f, 13.5f)
                reflectiveQuadToRelative(57f, 38.5f)
                close()
                moveTo(819f, 932f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(407f, 520f)
                close()
                moveToRelative(171f, -57f)
                close()
            }
        }.build()
        
        return _No_photography!!
    }

private var _No_photography: ImageVector? = null

