package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Model_training: ImageVector
    get() {
        if (_Model_training != null) return _Model_training!!
        
        _Model_training = ImageVector.Builder(
            name = "model_training",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(206f, 754f)
                quadToRelative(-41f, -48f, -63.5f, -107.5f)
                reflectiveQuadTo(120f, 520f)
                quadToRelative(0f, -150f, 105f, -255f)
                reflectiveQuadToRelative(255f, -105f)
                horizontalLineToRelative(8f)
                lineToRelative(-64f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                lineToRelative(-57f, -57f)
                lineToRelative(63f, -63f)
                horizontalLineToRelative(-6f)
                quadToRelative(-116f, 0f, -198f, 82f)
                reflectiveQuadToRelative(-82f, 198f)
                quadToRelative(0f, 51f, 16.5f, 96f)
                reflectiveQuadToRelative(46.5f, 81f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(234f, -14f)
                quadToRelative(0f, -23f, -15.5f, -45.5f)
                reflectiveQuadToRelative(-34.5f, -47f)
                quadToRelative(-19f, -24.5f, -34.5f, -51f)
                reflectiveQuadTo(340f, 540f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 30f, -15.5f, 56.5f)
                reflectiveQuadToRelative(-34.5f, 51f)
                quadToRelative(-19f, 24.5f, -34.5f, 47f)
                reflectiveQuadTo(520f, 740f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, 100f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(314f, -86f)
                lineToRelative(-57f, -57f)
                quadToRelative(30f, -36f, 46.5f, -81f)
                reflectiveQuadToRelative(16.5f, -96f)
                quadToRelative(0f, -66f, -27.5f, -122.5f)
                reflectiveQuadTo(657f, 303f)
                lineToRelative(57f, -57f)
                quadToRelative(58f, 50f, 92f, 120.5f)
                reflectiveQuadTo(840f, 520f)
                quadToRelative(0f, 67f, -22.5f, 126.5f)
                reflectiveQuadTo(754f, 754f)
                close()
            }
        }.build()
        
        return _Model_training!!
    }

private var _Model_training: ImageVector? = null

