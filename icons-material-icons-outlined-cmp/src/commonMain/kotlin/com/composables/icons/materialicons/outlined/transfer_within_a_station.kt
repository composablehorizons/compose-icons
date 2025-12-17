package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Transfer_within_a_station: ImageVector
    get() {
        if (_Transfer_within_a_station != null) return _Transfer_within_a_station!!
        
        _Transfer_within_a_station = ImageVector.Builder(
            name = "transfer_within_a_station",
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
                moveTo(16.49f, 15.5f)
                verticalLineToRelative(-1.75f)
                lineTo(14f, 16.25f)
                lineToRelative(2.49f, 2.5f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-5.51f)
                close()
                moveToRelative(3.02f, 4.25f)
                horizontalLineTo(14f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5.51f)
                verticalLineTo(23f)
                lineTo(22f, 20.5f)
                lineTo(19.51f, 18f)
                verticalLineToRelative(1.75f)
                close()
                moveTo(9.5f, 5.5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(5.75f, 8.9f)
                lineTo(3f, 23f)
                horizontalLineToRelative(2.1f)
                lineToRelative(1.75f, -8f)
                lineTo(9f, 17f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7.55f)
                lineTo(8.95f, 13.4f)
                lineToRelative(0.6f, -3f)
                curveTo(10.85f, 12f, 12.8f, 13f, 15f, 13f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.85f, 0f, -3.45f, -1f, -4.35f, -2.45f)
                lineToRelative(-0.95f, -1.6f)
                curveTo(9.35f, 6.35f, 8.7f, 6f, 8f, 6f)
                curveToRelative(-0.25f, 0f, -0.5f, 0.05f, -0.75f, 0.15f)
                lineTo(2f, 8.3f)
                verticalLineTo(13f)
                horizontalLineToRelative(2f)
                verticalLineTo(9.65f)
                lineToRelative(1.75f, -0.75f)
            }
        }.build()
        
        return _Transfer_within_a_station!!
    }

private var _Transfer_within_a_station: ImageVector? = null

