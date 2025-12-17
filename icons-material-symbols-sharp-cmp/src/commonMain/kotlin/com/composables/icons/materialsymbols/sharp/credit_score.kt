package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Credit_score: ImageVector
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
                moveTo(160f, 320f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(80f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(320f)
                horizontalLineTo(160f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(164f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(518f, 80f)
                lineTo(428f, 710f)
                lineToRelative(56f, -56f)
                lineToRelative(114f, 112f)
                lineToRelative(226f, -226f)
                lineToRelative(56f, 58f)
                lineTo(598f, 880f)
                close()
                moveTo(160f, 720f)
                verticalLineToRelative(-180f)
                verticalLineToRelative(113f)
                verticalLineToRelative(-413f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Credit_score!!
    }

private var _Credit_score: ImageVector? = null

