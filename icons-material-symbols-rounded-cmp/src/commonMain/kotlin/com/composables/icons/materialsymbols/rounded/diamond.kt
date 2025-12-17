package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Diamond: ImageVector
    get() {
        if (_Diamond != null) return _Diamond!!
        
        _Diamond = ImageVector.Builder(
            name = "diamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 795f)
                quadToRelative(-17f, 0f, -33f, -7.5f)
                reflectiveQuadTo(419f, 766f)
                lineTo(113f, 400f)
                quadToRelative(-9f, -11f, -13.5f, -24f)
                reflectiveQuadTo(95f, 349f)
                quadToRelative(0f, -9f, 1.5f, -18.5f)
                reflectiveQuadTo(103f, 313f)
                lineToRelative(75f, -149f)
                quadToRelative(11f, -20f, 29.5f, -32f)
                reflectiveQuadToRelative(41.5f, -12f)
                horizontalLineToRelative(462f)
                quadToRelative(23f, 0f, 41.5f, 12f)
                reflectiveQuadToRelative(29.5f, 32f)
                lineToRelative(75f, 149f)
                quadToRelative(5f, 8f, 6.5f, 17.5f)
                reflectiveQuadTo(865f, 349f)
                quadToRelative(0f, 14f, -4.5f, 27f)
                reflectiveQuadTo(847f, 400f)
                lineTo(541f, 766f)
                quadToRelative(-12f, 14f, -28f, 21.5f)
                reflectiveQuadToRelative(-33f, 7.5f)
                close()
                moveToRelative(-95f, -475f)
                horizontalLineToRelative(190f)
                lineToRelative(-60f, -120f)
                horizontalLineToRelative(-70f)
                lineToRelative(-60f, 120f)
                close()
                moveToRelative(55f, 347f)
                verticalLineToRelative(-267f)
                horizontalLineTo(218f)
                lineToRelative(222f, 267f)
                close()
                moveToRelative(80f, 0f)
                lineToRelative(222f, -267f)
                horizontalLineTo(520f)
                verticalLineToRelative(267f)
                close()
                moveToRelative(144f, -347f)
                horizontalLineToRelative(106f)
                lineToRelative(-60f, -120f)
                horizontalLineTo(604f)
                lineToRelative(60f, 120f)
                close()
                moveToRelative(-474f, 0f)
                horizontalLineToRelative(106f)
                lineToRelative(60f, -120f)
                horizontalLineTo(250f)
                lineToRelative(-60f, 120f)
                close()
            }
        }.build()
        
        return _Diamond!!
    }

private var _Diamond: ImageVector? = null

