package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Format_list_bulleted: ImageVector
    get() {
        if (_Format_list_bulleted != null) return _Format_list_bulleted!!
        
        _Format_list_bulleted = ImageVector.Builder(
            name = "format_list_bulleted",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 6f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4f, 7.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2.5f, 6f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5.5f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 11f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                close()
                moveToRelative(0f, 6f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                close()
                moveToRelative(-3f, 2.5f)
                curveToRelative(0.82f, 0f, 1.5f, -0.68f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.68f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.68f, 1.5f, 1.5f, 1.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5.5f, 12f)
                close()
            }
        }.build()
        
        return _Format_list_bulleted!!
    }

private var _Format_list_bulleted: ImageVector? = null

