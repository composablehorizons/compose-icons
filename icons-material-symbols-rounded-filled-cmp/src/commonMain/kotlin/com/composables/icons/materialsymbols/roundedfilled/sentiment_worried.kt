package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Sentiment_worried: ImageVector
    get() {
        if (_Sentiment_worried != null) return _Sentiment_worried!!
        
        _Sentiment_worried = ImageVector.Builder(
            name = "sentiment_worried",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(452f, 720f)
                horizontalLineToRelative(56f)
                quadToRelative(55f, 0f, 93.5f, -35f)
                reflectiveQuadToRelative(38.5f, -85f)
                quadToRelative(0f, -50f, -38.5f, -85f)
                reflectiveQuadTo(508f, 480f)
                horizontalLineToRelative(-56f)
                quadToRelative(-55f, 0f, -93.5f, 35f)
                reflectiveQuadTo(320f, 600f)
                quadToRelative(0f, 50f, 38.5f, 85f)
                reflectiveQuadToRelative(93.5f, 35f)
                close()
                moveToRelative(0f, -60f)
                quadToRelative(-30f, 0f, -51f, -17.5f)
                reflectiveQuadTo(380f, 600f)
                quadToRelative(0f, -25f, 21f, -42.5f)
                reflectiveQuadToRelative(51f, -17.5f)
                horizontalLineToRelative(56f)
                quadToRelative(30f, 0f, 51f, 17.5f)
                reflectiveQuadToRelative(21f, 42.5f)
                quadToRelative(0f, 25f, -21f, 42.5f)
                reflectiveQuadTo(508f, 660f)
                horizontalLineToRelative(-56f)
                close()
                moveTo(320f, 400f)
                quadToRelative(43f, 0f, 76.5f, -27.5f)
                reflectiveQuadTo(438f, 303f)
                quadToRelative(2f, -10f, -7f, -16.5f)
                reflectiveQuadToRelative(-21f, -6.5f)
                quadToRelative(-11f, 0f, -20f, 5.5f)
                reflectiveQuadTo(376f, 302f)
                quadToRelative(-7f, 17f, -22f, 27.5f)
                reflectiveQuadTo(320f, 340f)
                horizontalLineToRelative(-50f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(240f, 370f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(270f, 400f)
                horizontalLineToRelative(50f)
                close()
                moveToRelative(320f, 0f)
                horizontalLineToRelative(50f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(720f, 370f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(690f, 340f)
                horizontalLineToRelative(-50f)
                quadToRelative(-19f, 0f, -34f, -10.5f)
                reflectiveQuadTo(584f, 302f)
                quadToRelative(-5f, -11f, -14f, -16.5f)
                reflectiveQuadToRelative(-20f, -5.5f)
                quadToRelative(-12f, 0f, -21f, 6.5f)
                reflectiveQuadToRelative(-7f, 16.5f)
                quadToRelative(8f, 42f, 41.5f, 69.5f)
                reflectiveQuadTo(640f, 400f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Sentiment_worried!!
    }

private var _Sentiment_worried: ImageVector? = null

