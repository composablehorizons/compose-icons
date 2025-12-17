package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Motion_photos_off: ImageVector
    get() {
        if (_Motion_photos_off != null) return _Motion_photos_off!!
        
        _Motion_photos_off = ImageVector.Builder(
            name = "motion_photos_off",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.84f, 20.84f)
                lineTo(3.16f, 3.16f)
                lineTo(1.89f, 4.43f)
                lineToRelative(1.89f, 1.89f)
                curveTo(2.66f, 7.93f, 2f, 9.89f, 2f, 12f)
                curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                curveToRelative(2.11f, 0f, 4.07f, -0.66f, 5.68f, -1.77f)
                lineToRelative(1.89f, 1.89f)
                lineToRelative(1.27f, -1.28f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                curveToRelative(0f, -1.55f, 0.45f, -3f, 1.22f, -4.23f)
                lineToRelative(1.46f, 1.46f)
                curveTo(6.25f, 10.06f, 6f, 11f, 6f, 12f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                curveToRelative(1f, 0f, 1.94f, -0.25f, 2.77f, -0.68f)
                lineToRelative(1.46f, 1.46f)
                curveTo(15f, 19.55f, 13.55f, 20f, 12f, 20f)
                close()
                moveTo(6.32f, 3.77f)
                curveTo(7.93f, 2.66f, 9.89f, 2f, 12f, 2f)
                curveToRelative(5.52f, 0f, 10f, 4.48f, 10f, 10f)
                curveToRelative(0f, 2.11f, -0.66f, 4.07f, -1.77f, 5.68f)
                lineToRelative(-1.45f, -1.45f)
                curveTo(19.55f, 15f, 20f, 13.55f, 20f, 12f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                curveToRelative(-1.55f, 0f, -3f, 0.45f, -4.23f, 1.22f)
                lineTo(6.32f, 3.77f)
                close()
                moveTo(18f, 12f)
                curveToRelative(0f, 1f, -0.25f, 1.94f, -0.68f, 2.77f)
                lineTo(9.23f, 6.68f)
                curveTo(10.06f, 6.25f, 11f, 6f, 12f, 6f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                close()
            }
        }.build()
        
        return _Motion_photos_off!!
    }

private var _Motion_photos_off: ImageVector? = null

