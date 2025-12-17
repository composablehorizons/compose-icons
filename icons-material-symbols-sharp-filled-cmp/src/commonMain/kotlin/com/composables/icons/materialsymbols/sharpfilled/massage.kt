package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Massage: ImageVector
    get() {
        if (_Massage != null) return _Massage!!
        
        _Massage = ImageVector.Builder(
            name = "massage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(220f, 541f)
                lineTo(80f, 200f)
                lineToRelative(240f, -120f)
                lineToRelative(80f, 120f)
                horizontalLineToRelative(241f)
                lineToRelative(279f, 280f)
                lineToRelative(-77f, 77f)
                lineToRelative(-333f, -189f)
                lineToRelative(-110f, -8f)
                lineToRelative(-4f, 60f)
                lineToRelative(93f, 7f)
                lineToRelative(130f, 73f)
                lineToRelative(-39f, 80f)
                lineToRelative(-360f, -39f)
                close()
                moveToRelative(-90f, 298f)
                lineToRelative(-22f, -77f)
                lineToRelative(190f, -50f)
                quadToRelative(72f, -19f, 153f, -35.5f)
                reflectiveQuadTo(599f, 660f)
                quadToRelative(75f, 0f, 139.5f, 30f)
                reflectiveQuadTo(866f, 771f)
                lineToRelative(-54f, 59f)
                quadToRelative(-51f, -43f, -105.5f, -66.5f)
                reflectiveQuadTo(599f, 740f)
                quadToRelative(-64f, 0f, -141f, 16.5f)
                reflectiveQuadTo(319f, 789f)
                lineToRelative(-189f, 50f)
                close()
            }
        }.build()
        
        return _Massage!!
    }

private var _Massage: ImageVector? = null

