package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Checklist_rtl: ImageVector
    get() {
        if (_Checklist_rtl != null) return _Checklist_rtl!!
        
        _Checklist_rtl = ImageVector.Builder(
            name = "checklist_rtl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(655f, 760f)
                lineTo(513f, 618f)
                lineToRelative(56f, -56f)
                lineToRelative(85f, 85f)
                lineToRelative(170f, -170f)
                lineToRelative(56f, 57f)
                lineToRelative(-225f, 226f)
                close()
                moveToRelative(0f, -320f)
                lineTo(513f, 298f)
                lineToRelative(56f, -56f)
                lineToRelative(85f, 85f)
                lineToRelative(170f, -170f)
                lineToRelative(56f, 57f)
                lineToRelative(-225f, 226f)
                close()
                moveTo(80f, 680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, -320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Checklist_rtl!!
    }

private var _Checklist_rtl: ImageVector? = null

