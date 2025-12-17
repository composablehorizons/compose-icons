package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Play_for_work: ImageVector
    get() {
        if (_Play_for_work != null) return _Play_for_work!!
        
        _Play_for_work = ImageVector.Builder(
            name = "play_for_work",
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
                moveTo(11f, 5f)
                verticalLineToRelative(5.59f)
                horizontalLineTo(7.5f)
                lineToRelative(4.5f, 4.5f)
                lineToRelative(4.5f, -4.5f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(-5f, 9f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                horizontalLineTo(6f)
                close()
            }
        }.build()
        
        return _Play_for_work!!
    }

private var _Play_for_work: ImageVector? = null

