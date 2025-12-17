package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Pdf_off: ImageVector
    get() {
        if (_Pdf_off != null) return _Pdf_off!!
        
        _Pdf_off = ImageVector.Builder(
            name = "pdf_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 556f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(-60f, 140f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(100f)
                verticalLineTo(496f)
                lineToRelative(-40f, -40f)
                horizontalLineTo(220f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(196f, 0f)
                horizontalLineToRelative(120f)
                lineToRelative(4f, -60f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(-64f)
                lineToRelative(-60f, -60f)
                verticalLineToRelative(184f)
                close()
                moveTo(120f, 936f)
                verticalLineTo(242f)
                lineToRelative(-8f, -34f)
                lineToRelative(728f, 728f)
                horizontalLineTo(120f)
                close()
                moveToRelative(664f, 56f)
                lineTo(56f, 264f)
                lineToRelative(56f, -56f)
                lineToRelative(728f, 728f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(233f, 216f)
                horizontalLineToRelative(607f)
                verticalLineToRelative(607f)
                lineTo(680f, 663f)
                verticalLineToRelative(-47f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-60f)
                horizontalLineTo(620f)
                verticalLineToRelative(147f)
                lineToRelative(-44f, -44f)
                verticalLineToRelative(-63f)
                lineToRelative(-40f, -40f)
                horizontalLineToRelative(-63f)
                lineTo(233f, 216f)
                close()
            }
        }.build()
        
        return _Pdf_off!!
    }

private var _Pdf_off: ImageVector? = null

