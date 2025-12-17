package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Rate_review: ImageVector
    get() {
        if (_Rate_review != null) return _Rate_review!!
        
        _Rate_review = ImageVector.Builder(
            name = "rate_review",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 560f)
                horizontalLineToRelative(123f)
                lineToRelative(241f, -242f)
                lineToRelative(-120f, -123f)
                lineToRelative(-244f, 242f)
                verticalLineToRelative(123f)
                close()
                moveToRelative(242f, -204f)
                lineToRelative(-38f, -37f)
                lineToRelative(39f, -39f)
                lineToRelative(37f, 38f)
                lineToRelative(-38f, 38f)
                close()
                moveToRelative(-34f, 204f)
                horizontalLineToRelative(272f)
                verticalLineToRelative(-80f)
                horizontalLineTo(528f)
                lineToRelative(-80f, 80f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(240f)
                lineTo(80f, 880f)
                close()
            }
        }.build()
        
        return _Rate_review!!
    }

private var _Rate_review: ImageVector? = null

