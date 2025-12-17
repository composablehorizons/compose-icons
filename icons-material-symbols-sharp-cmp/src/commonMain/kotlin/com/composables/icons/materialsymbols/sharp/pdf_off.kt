package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Pdf_off: ImageVector
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
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-60f, 140f)
                verticalLineTo(456f)
                horizontalLineToRelative(120f)
                lineToRelative(40f, 40f)
                verticalLineToRelative(120f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(196f, 0f)
                verticalLineTo(512f)
                lineToRelative(60f, 60f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(64f)
                lineToRelative(-4f, 60f)
                horizontalLineTo(416f)
                close()
                moveToRelative(160f, -137f)
                lineTo(473f, 456f)
                horizontalLineToRelative(63f)
                lineToRelative(40f, 40f)
                verticalLineToRelative(63f)
                close()
                moveToRelative(104f, 104f)
                lineToRelative(-60f, -60f)
                verticalLineTo(456f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(47f)
                close()
                moveToRelative(160f, 160f)
                lineToRelative(-80f, -80f)
                verticalLineTo(296f)
                horizontalLineTo(313f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(607f)
                verticalLineToRelative(607f)
                close()
                moveTo(120f, 936f)
                verticalLineTo(217f)
                lineToRelative(80f, 79f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                lineToRelative(79f, 80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(671f, 64f)
                lineTo(56f, 264f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 56f)
                close()
                moveTo(424f, 632f)
                close()
                moveToRelative(113f, -113f)
                close()
            }
        }.build()
        
        return _Pdf_off!!
    }

private var _Pdf_off: ImageVector? = null

