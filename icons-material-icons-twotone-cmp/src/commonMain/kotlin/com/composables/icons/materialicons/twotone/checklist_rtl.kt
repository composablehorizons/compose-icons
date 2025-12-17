package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Checklist_rtl: ImageVector
    get() {
        if (_Checklist_rtl != null) return _Checklist_rtl!!
        
        _Checklist_rtl = ImageVector.Builder(
            name = "checklist_rtl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 7f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9f)
                verticalLineTo(7f)
                close()
                moveTo(11f, 15f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9f)
                verticalLineTo(15f)
                close()
                moveTo(16.34f, 11f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.24f, -4.24f)
                lineTo(22f, 5.34f)
                lineTo(16.34f, 11f)
                close()
                moveTo(16.34f, 19f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.24f, -4.24f)
                lineTo(22f, 13.34f)
                lineTo(16.34f, 19f)
                close()
            }
        }.build()
        
        return _Checklist_rtl!!
    }

private var _Checklist_rtl: ImageVector? = null

