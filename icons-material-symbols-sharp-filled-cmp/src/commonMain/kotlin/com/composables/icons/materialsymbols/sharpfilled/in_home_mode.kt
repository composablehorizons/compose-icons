package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.In_home_mode: ImageVector
    get() {
        if (_In_home_mode != null) return _In_home_mode!!
        
        _In_home_mode = ImageVector.Builder(
            name = "in_home_mode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(597f, 880f)
                lineTo(428f, 710f)
                lineToRelative(56f, -57f)
                lineToRelative(113f, 113f)
                lineToRelative(227f, -226f)
                lineToRelative(56f, 57f)
                lineTo(597f, 880f)
                close()
                moveToRelative(-437f, -80f)
                verticalLineToRelative(-375f)
                lineToRelative(-72f, 55f)
                lineToRelative(-47f, -63f)
                lineToRelative(439f, -337f)
                lineToRelative(440f, 336f)
                lineToRelative(-48f, 64f)
                lineToRelative(-59f, -44f)
                lineToRelative(-216f, 217f)
                lineToRelative(-113f, -113f)
                lineToRelative(-171f, 172f)
                lineToRelative(87f, 88f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _In_home_mode!!
    }

private var _In_home_mode: ImageVector? = null

