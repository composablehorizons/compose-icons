package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Devices_fold_2: ImageVector
    get() {
        if (_Devices_fold_2 != null) return _Devices_fold_2!!
        
        _Devices_fold_2 = ImageVector.Builder(
            name = "devices_fold_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(558f)
                lineToRelative(160f, 400f)
                horizontalLineTo(760f)
                verticalLineToRelative(320f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-240f)
                horizontalLineTo(322f)
                lineToRelative(-42f, -105f)
                verticalLineToRelative(345f)
                close()
            }
        }.build()
        
        return _Devices_fold_2!!
    }

private var _Devices_fold_2: ImageVector? = null

