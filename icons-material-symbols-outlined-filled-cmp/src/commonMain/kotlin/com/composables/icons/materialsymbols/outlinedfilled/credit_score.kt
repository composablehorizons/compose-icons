package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Credit_score: ImageVector
    get() {
        if (_Credit_score != null) return _Credit_score!!
        
        _Credit_score = ImageVector.Builder(
            name = "credit_score",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(405f, 800f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(240f)
                horizontalLineTo(771f)
                lineTo(598f, 653f)
                lineTo(484f, 541f)
                lineTo(315f, 710f)
                lineToRelative(90f, 90f)
                close()
                moveToRelative(193f, 80f)
                lineTo(428f, 710f)
                lineToRelative(56f, -56f)
                lineToRelative(114f, 112f)
                lineToRelative(226f, -226f)
                lineToRelative(56f, 58f)
                lineTo(598f, 880f)
                close()
                moveTo(160f, 320f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-160f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Credit_score!!
    }

private var _Credit_score: ImageVector? = null

