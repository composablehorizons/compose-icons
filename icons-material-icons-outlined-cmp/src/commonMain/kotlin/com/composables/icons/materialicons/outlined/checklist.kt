package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Checklist: ImageVector
    get() {
        if (_Checklist != null) return _Checklist!!
        
        _Checklist = ImageVector.Builder(
            name = "checklist",
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
                moveTo(22f, 7f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9f)
                verticalLineTo(7f)
                close()
                moveTo(22f, 15f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9f)
                verticalLineTo(15f)
                close()
                moveTo(5.54f, 11f)
                lineTo(2f, 7.46f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.24f, -4.24f)
                lineToRelative(1.41f, 1.41f)
                lineTo(5.54f, 11f)
                close()
                moveTo(5.54f, 19f)
                lineTo(2f, 15.46f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.24f, -4.24f)
                lineToRelative(1.41f, 1.41f)
                lineTo(5.54f, 19f)
                close()
            }
        }.build()
        
        return _Checklist!!
    }

private var _Checklist: ImageVector? = null

