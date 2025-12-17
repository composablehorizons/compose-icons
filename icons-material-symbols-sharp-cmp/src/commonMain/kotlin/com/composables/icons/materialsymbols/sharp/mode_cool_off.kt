package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mode_cool_off: ImageVector
    get() {
        if (_Mode_cool_off != null) return _Mode_cool_off!!
        
        _Mode_cool_off = ImageVector.Builder(
            name = "mode_cool_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(767f, 960f)
                lineTo(520f, 713f)
                verticalLineToRelative(167f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-166f)
                lineTo(310f, 842f)
                lineToRelative(-56f, -56f)
                lineToRelative(170f, -170f)
                lineToRelative(-80f, -80f)
                lineToRelative(-170f, 170f)
                lineToRelative(-56f, -56f)
                lineToRelative(128f, -130f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(167f)
                lineTo(31f, 224f)
                lineToRelative(57f, -57f)
                lineTo(824f, 903f)
                lineTo(767f, 960f)
                close()
                moveToRelative(19f, -254f)
                lineTo(600f, 520f)
                horizontalLineToRelative(-45f)
                lineTo(440f, 405f)
                verticalLineToRelative(-45f)
                lineTo(254f, 174f)
                lineToRelative(56f, -56f)
                lineToRelative(130f, 128f)
                verticalLineToRelative(-166f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(166f)
                lineToRelative(130f, -128f)
                lineToRelative(56f, 56f)
                lineToRelative(-186f, 186f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                lineToRelative(186f, -186f)
                lineToRelative(56f, 56f)
                lineToRelative(-128f, 130f)
                horizontalLineToRelative(166f)
                verticalLineToRelative(80f)
                horizontalLineTo(714f)
                lineToRelative(128f, 130f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Mode_cool_off!!
    }

private var _Mode_cool_off: ImageVector? = null

