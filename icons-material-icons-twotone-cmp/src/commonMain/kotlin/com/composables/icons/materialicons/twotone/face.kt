package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Face: ImageVector
    get() {
        if (_Face != null) return _Face!!
        
        _Face = ImageVector.Builder(
            name = "face",
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
                moveTo(17.5f, 8f)
                curveToRelative(0.46f, 0f, 0.91f, -0.05f, 1.34f, -0.12f)
                curveTo(17.44f, 5.56f, 14.9f, 4f, 12f, 4f)
                curveToRelative(-0.46f, 0f, -0.91f, 0.05f, -1.34f, 0.12f)
                curveTo(12.06f, 6.44f, 14.6f, 8f, 17.5f, 8f)
                close()
                moveTo(8.08f, 5.03f)
                curveTo(6.37f, 6f, 5.05f, 7.58f, 4.42f, 9.47f)
                curveToRelative(1.71f, -0.97f, 3.03f, -2.55f, 3.66f, -4.44f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                close()
                moveToRelative(0f, 2f)
                curveToRelative(2.9f, 0f, 5.44f, 1.56f, 6.84f, 3.88f)
                curveToRelative(-0.43f, 0.07f, -0.88f, 0.12f, -1.34f, 0.12f)
                curveToRelative(-2.9f, 0f, -5.44f, -1.56f, -6.84f, -3.88f)
                curveToRelative(0.43f, -0.07f, 0.88f, -0.12f, 1.34f, -0.12f)
                close()
                moveTo(8.08f, 5.03f)
                curveTo(7.45f, 6.92f, 6.13f, 8.5f, 4.42f, 9.47f)
                curveTo(5.05f, 7.58f, 6.37f, 6f, 8.08f, 5.03f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                curveToRelative(0f, -0.05f, 0.01f, -0.1f, 0.01f, -0.15f)
                curveToRelative(2.6f, -0.98f, 4.68f, -2.99f, 5.74f, -5.55f)
                curveToRelative(1.83f, 2.26f, 4.62f, 3.7f, 7.75f, 3.7f)
                curveToRelative(0.75f, 0f, 1.47f, -0.09f, 2.17f, -0.24f)
                curveToRelative(0.21f, 0.71f, 0.33f, 1.46f, 0.33f, 2.24f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.25f, 13f)
                arcTo(1.25f, 1.25f, 0f, false, true, 9f, 14.25f)
                arcTo(1.25f, 1.25f, 0f, false, true, 7.75f, 13f)
                arcTo(1.25f, 1.25f, 0f, false, true, 10.25f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.25f, 13f)
                arcTo(1.25f, 1.25f, 0f, false, true, 15f, 14.25f)
                arcTo(1.25f, 1.25f, 0f, false, true, 13.75f, 13f)
                arcTo(1.25f, 1.25f, 0f, false, true, 16.25f, 13f)
                close()
            }
        }.build()
        
        return _Face!!
    }

private var _Face: ImageVector? = null

