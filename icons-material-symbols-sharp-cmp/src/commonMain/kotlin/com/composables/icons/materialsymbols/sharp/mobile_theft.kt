package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mobile_theft: ImageVector
    get() {
        if (_Mobile_theft != null) return _Mobile_theft!!
        
        _Mobile_theft = ImageVector.Builder(
            name = "mobile_theft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(873f, 420f)
                lineTo(618f, 675f)
                lineToRelative(-57f, -56f)
                lineToRelative(255f, -255f)
                quadToRelative(12f, -12f, 18f, -26.5f)
                reflectiveQuadToRelative(6f, -30.5f)
                quadToRelative(0f, -15f, -6f, -30f)
                reflectiveQuadToRelative(-18f, -27f)
                lineTo(687f, 121f)
                horizontalLineTo(524f)
                lineToRelative(89f, 49f)
                lineToRelative(-277f, 279f)
                lineToRelative(-57f, -57f)
                lineToRelative(203f, -203f)
                lineToRelative(-102f, -57f)
                verticalLineToRelative(-92f)
                horizontalLineToRelative(339f)
                lineToRelative(154f, 154f)
                quadToRelative(23f, 23f, 34.5f, 52.5f)
                reflectiveQuadTo(919f, 307f)
                quadToRelative(1f, 31f, -11f, 60.5f)
                reflectiveQuadTo(873f, 420f)
                close()
                moveToRelative(-283f, -57f)
                lineTo(363f, 589f)
                lineToRelative(-57f, -55f)
                lineToRelative(227f, -227f)
                lineToRelative(57f, 56f)
                close()
                moveToRelative(85f, 85f)
                lineTo(477f, 646f)
                lineToRelative(-56f, -57f)
                lineToRelative(197f, -198f)
                lineToRelative(57f, 57f)
                close()
                moveToRelative(-11f, -140f)
                close()
                moveTo(303f, 497f)
                close()
                moveToRelative(190f, 227f)
                lineToRelative(79f, 11f)
                lineToRelative(-29f, 197f)
                lineToRelative(-515f, -77f)
                lineToRelative(118f, -791f)
                lineToRelative(147f, 22f)
                lineToRelative(-12f, 79f)
                lineToRelative(-68f, -10f)
                lineToRelative(-93f, 633f)
                lineToRelative(356f, 52f)
                lineToRelative(17f, -116f)
                close()
                moveTo(702f, 920f)
                lineToRelative(-42f, -42f)
                lineToRelative(117f, -118f)
                horizontalLineToRelative(-97f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-97f)
                lineTo(702f, 920f)
                close()
            }
        }.build()
        
        return _Mobile_theft!!
    }

private var _Mobile_theft: ImageVector? = null

