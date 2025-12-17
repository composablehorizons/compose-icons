package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Sentiment_extremely_dissatisfied: ImageVector
    get() {
        if (_Sentiment_extremely_dissatisfied != null) return _Sentiment_extremely_dissatisfied!!
        
        _Sentiment_extremely_dissatisfied = ImageVector.Builder(
            name = "sentiment_extremely_dissatisfied",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                moveToRelative(0f, -80f)
                quadToRelative(133f, 0f, 226.5f, -93.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -133f, -93.5f, -226.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-133f, 0f, -226.5f, 93.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 133f, 93.5f, 226.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(60f, -364f)
                lineToRelative(20f, -12f)
                quadToRelative(2f, 24f, 19f, 40f)
                reflectiveQuadToRelative(41f, 16f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(680f, 420f)
                quadToRelative(0f, -15f, -7f, -28.5f)
                reflectiveQuadTo(654f, 370f)
                lineToRelative(26f, -15f)
                lineToRelative(-20f, -35f)
                lineToRelative(-140f, 80f)
                lineToRelative(20f, 36f)
                close()
                moveToRelative(-120f, 0f)
                lineToRelative(20f, -36f)
                lineToRelative(-140f, -80f)
                lineToRelative(-20f, 35f)
                lineToRelative(26f, 15f)
                quadToRelative(-12f, 8f, -19f, 21.5f)
                reflectiveQuadToRelative(-7f, 28.5f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(340f, 480f)
                quadToRelative(24f, 0f, 41f, -16f)
                reflectiveQuadToRelative(19f, -40f)
                lineToRelative(20f, 12f)
                close()
                moveToRelative(60f, 84f)
                quadToRelative(-71f, 0f, -125f, 45.5f)
                reflectiveQuadTo(279f, 680f)
                horizontalLineToRelative(402f)
                quadToRelative(-22f, -69f, -76f, -114.5f)
                reflectiveQuadTo(480f, 520f)
                close()
                moveToRelative(0f, -40f)
                close()
            }
        }.build()
        
        return _Sentiment_extremely_dissatisfied!!
    }

private var _Sentiment_extremely_dissatisfied: ImageVector? = null

